package day1;
// Day 1 - 实战：重构传统 switch 代码

public class Calculator {

    // 传统方式：处理不同类型的计算
    public static Number calculateTraditional(String operation, Number a, Number b) {
        if (operation == null) {
            throw new IllegalArgumentException("操作不能为null");
        }

        Number result;
        switch (operation) {
            case "add":
                if (a instanceof Integer && b instanceof Integer) {
                    result = a.intValue() + b.intValue();
                } else if (a instanceof Double && b instanceof Double) {
                    result = a.doubleValue() + b.doubleValue();
                } else {
                    throw new IllegalArgumentException("类型不匹配");
                }
                break;
            case "subtract":
                // 类似的冗长代码...
                result = null; // 简化示例
                break;
            case "multiply":
                // 类似的冗长代码...
                result = null;
                break;
            default:
                throw new IllegalArgumentException("未知操作");
        }
        return result;
    }

    // Java 21 方式：简洁而强大
    public static Number calculateModern(String operation, Number a, Number b) {
        return switch (operation) {
            case null -> throw new IllegalArgumentException("操作不能为null");
            case "add" -> switch (a) {
                case Integer i when b instanceof Integer j -> i + j;
                case Double d when b instanceof Double e -> d + e;
                default -> throw new IllegalArgumentException("类型不匹配");
            };
            case "subtract" -> switch (a) {
                case Integer i when b instanceof Integer j -> i - j;
                case Double d when b instanceof Double e -> d - e;
                default -> throw new IllegalArgumentException("类型不匹配");
            };
            case "multiply" -> switch (a) {
                case Integer i when b instanceof Integer j -> i * j;
                case Double d when b instanceof Double e -> d * e;
                default -> throw new IllegalArgumentException("类型不匹配");
            };
            default -> throw new IllegalArgumentException("未知操作");
        };
    }
}
