package io.vertx.tp.workflow.refine;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.WProcess;
import io.vertx.up.log.Annal;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.model.bpmn.instance.EndEvent;
import org.camunda.bpm.model.bpmn.instance.StartEvent;

import java.util.Objects;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class Wf {

    /*
     * {
     *      "task": "Event name of task, event id",
     *      "multiple": "Whether there are more than one task"
     * }
     */
    public static JsonObject taskStart(final JsonObject workflow, final Set<StartEvent> starts) {
        return WfFlow.taskStart(workflow, starts);
    }

    public static JsonObject taskEnd(final JsonObject workflow, final Set<EndEvent> ends) {
        return WfFlow.taskEnd(workflow, ends);
    }

    /*
     * {
     *      "task": "Event name of task, event id",
     *      "multiple": "Whether there are more than one task",
     *      "history": []
     * }
     */
    public static JsonObject taskOut(final JsonObject workflow, final Task task) {
        return WfFlow.taskOut(workflow, task);
    }

    /*
     * Form Query parameters
     * {
     *      "dynamic": "Boolean value to check whether form is static or dynamic",
     *      "code": "configFile, STATIC | form code ( UI_FORM ), DYNAMIC",
     *      "sigma": "When dynamic = true, it's required here."
     * }
     */
    public static JsonObject formInput(final JsonObject form, final String sigma) {
        return WfFlow.formInput(form, sigma);
    }

    /*
     * Form output here
     * {
     *      "code": "Process Definition Key",
     *      "formKey": "The extract form key here, such as 'camunda-forms:deployment:xxx'",
     *      "definitionId": "Process Definition Id",
     *      "definitionKey": "Process Definition Key",
     * }
     */
    public static JsonObject formOut(final String formKey, final String definitionId, final String definitionKey) {
        return WfFlow.formOut(formKey, definitionId, definitionKey);
    }

    /*
     * Workflow Output
     * {
     *      "definitionId": "Process Definition Id",
     *      "definitionKey": "Process Definition Key",
     *      "bpmn": "Xml format of BPMN 2.0 diagram",
     *      "name": "Process Definition Name"
     * }
     */
    public static JsonObject bpmnOut(final ProcessDefinition definition) {
        return WfFlow.bpmnOut(definition);
    }

    // Fetch ProcessDefinition
    public static Future<ProcessDefinition> processByKey(final String definitionKey) {
        return WfFlow.processByKey(definitionKey);
    }

    // Fetch ProcessDefinition
    public static Future<ProcessDefinition> processById(final String definitionId) {
        return WfFlow.processById(definitionId);
    }

    // Fetch ProcessInstance
    public static Future<ProcessInstance> instanceById(final String instanceId) {
        return WfFlow.instanceById(instanceId);
    }

    // Fetch WProcess ( Running )
    public static Future<WProcess> instance(final String instanceId) {
        // Fetch Instance First
        return WfFlow.instanceById(instanceId).compose(instance -> {
            if (Objects.isNull(instance)) {
                // History
                return WfFlow.instanceFinished(instanceId)
                    .compose(instanceFinished -> WfFlow.processById(instanceFinished.getProcessDefinitionId())
                        .compose(definition -> WProcess.future(definition, instanceFinished))
                    );
            } else {
                // Running
                return WfFlow.processById(instance.getProcessDefinitionId())
                    .compose(definition -> WProcess.future(definition, instance));
            }
        });
    }

    // BiFunction on ProcessDefinition / ProcessInstance

    public static class Log {
        public static void infoInit(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.info(logger, "Init", message, args);
        }

        public static void initQueue(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.info(logger, "Queue", message, args);
        }

        public static void debugInit(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.debug(logger, "Init", message, args);
        }

        public static void infoDeploy(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.info(logger, "Deploy", message, args);
        }

        public static void warnDeploy(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.warn(logger, "Deploy", message, args);
        }

        public static void warnMove(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.warn(logger, "Move", message, args);
        }

        public static void debugDeploy(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.debug(logger, "Deploy", message, args);
        }

        public static void infoMove(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.info(logger, "Move", message, args);
        }

        public static void infoWeb(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.info(logger, "Web", message, args);
        }

        public static void debugMove(final Class<?> clazz, final String message, final Object... args) {
            final Annal logger = Annal.get(clazz);
            WfLog.debug(logger, "Move", message, args);
        }
    }
}
