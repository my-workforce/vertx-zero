/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain;


import cn.vertxup.tpl.domain.tables.*;
import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Db extends SchemaImpl {

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>DB_ETERNAL.MY_BAG</code>.
     */
    public final MyBag MY_BAG = MyBag.MY_BAG;

    /**
     * The table <code>DB_ETERNAL.MY_DESKTOP</code>.
     */
    public final MyDesktop MY_DESKTOP = MyDesktop.MY_DESKTOP;

    /**
     * The table <code>DB_ETERNAL.MY_FAVOR</code>.
     */
    public final MyFavor MY_FAVOR = MyFavor.MY_FAVOR;

    /**
     * The table <code>DB_ETERNAL.MY_MENU</code>.
     */
    public final MyMenu MY_MENU = MyMenu.MY_MENU;

    /**
     * The table <code>DB_ETERNAL.MY_SETTING</code>.
     */
    public final MySetting MY_SETTING = MySetting.MY_SETTING;

    /**
     * The table <code>DB_ETERNAL.MY_TPL</code>.
     */
    public final MyTpl MY_TPL = MyTpl.MY_TPL;

    /**
     * The table <code>DB_ETERNAL.TPL_MESSAGE</code>.
     */
    public final TplMessage TPL_MESSAGE = TplMessage.TPL_MESSAGE;

    /**
     * The table <code>DB_ETERNAL.TPL_MODEL</code>.
     */
    public final TplModel TPL_MODEL = TplModel.TPL_MODEL;

    /**
     * The table <code>DB_ETERNAL.TPL_TICKET</code>.
     */
    public final TplTicket TPL_TICKET = TplTicket.TPL_TICKET;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            MyBag.MY_BAG,
            MyDesktop.MY_DESKTOP,
            MyFavor.MY_FAVOR,
            MyMenu.MY_MENU,
            MySetting.MY_SETTING,
            MyTpl.MY_TPL,
            TplMessage.TPL_MESSAGE,
            TplModel.TPL_MODEL,
            TplTicket.TPL_TICKET
        );
    }
}