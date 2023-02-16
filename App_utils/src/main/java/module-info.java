/**
 * Provides multiple classes to make easier certain task (formatting text, managing collections, etc.)
 */
module App_utils {

    requires static lombok;

    exports App_utils.printer;
    exports App_utils.arrayUtils;
    exports App_utils.math;

    opens App_utils.printer;
    opens App_utils.arrayUtils;
    opens App_utils.math;
}