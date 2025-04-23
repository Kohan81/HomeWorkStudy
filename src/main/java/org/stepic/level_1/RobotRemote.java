package org.stepic.level_1;

public class RobotRemote {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.x = 0;
        robot.y = 0;
        robot.direction = Direction.UP;

        Robot.moveRobot(robot, -3, 6);

    }
}


 class Robot {

    int x;  int y;
    Direction direction;

    public Direction getDirection() {
        return direction;// текущее направление взгляда
    }

    public int getX() {
        return x;// текущая координата X
    }

    public int getY() {
        return y;// текущая координата Y
    }

    public void turnLeft() {
        System.out.println("robot.turnLeft()");
        switch (direction){
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case UP:
                 direction = Direction.LEFT;
                 break;
            case DOWN:
                 direction = Direction.RIGHT;
            break;
        }
                // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        System.out.println("robot.turnRight()");
        switch (direction){
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
        }// повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        System.out.println("robot.stepForward()");
        switch (direction){
            case LEFT:
                x -=1;
                break;
            case RIGHT:
                x += 1;
                break;
            case UP:
                y += 1;
                break;
            case DOWN:
                y -= 1;
                break;
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

//     public static void moveRobot(Robot robot, int toX, int toY) {
//         int deltaX = toX - robot.getX();
//         int deltaY = toY - robot.getY();
//
//         if (deltaX != 0) {
//             if (deltaX > 0) {
//                 while (robot.getDirection() != Direction.RIGHT) {
//                     robot.turnRight();
//                 }
//             } else {
//                 while (robot.getDirection() != Direction.LEFT) {
//                     robot.turnRight();
//                 }
//             }
//             for (int i = 0; i < Math.abs(deltaX); i++) {
//                 robot.stepForward();
//             }
//         }
//
//         if (deltaY != 0) {
//             if (deltaY > 0) {
//                 while (robot.getDirection() != Direction.UP) {
//                     robot.turnRight();
//                 }
//             } else {
//                 while (robot.getDirection() != Direction.DOWN) {
//                     robot.turnRight();
//                 }
//             }
//             for (int i = 0; i < Math.abs(deltaY); i++) {
//                 robot.stepForward();
//             }
//         }
//     }

     public static void moveRobot(Robot robot, int toX, int toY) {
         int x = robot.getX();
         int y = robot.getY();

         System.out.println("x = " + x + ", " + " y = " + y + ", " + "direction = " + robot.getDirection());

         while (x != toX){
             if (x < toX){
                 while (robot.direction !=  Direction.RIGHT){
                     robot.turnRight();
                     System.out.println("direction = " + robot.getDirection());
                 }
                 robot.stepForward();
                 x = robot.getX();
                 System.out.println("x = " + x);

             } else if (x > toX){
                 while (robot.direction !=  Direction.LEFT){
                     robot.turnLeft();
                     System.out.println("direction = " + robot.getDirection());
                 }
                 robot.stepForward();
                 x = robot.getX();
                 System.out.println("x = " + x);
             }
         }
         while (y != toY){
             if (y < toY){
                 while (robot.direction !=  Direction.UP){
                     robot.turnLeft();
                     System.out.println("direction = " + robot.getDirection());
                 }
                 robot.stepForward();
                 y = robot.getY();
                 System.out.println(" y = " + y);
             } else if (y > toY){
                 while (robot.direction !=  Direction.DOWN){
                     robot.turnRight();
                     System.out.println("direction = " + robot.getDirection());
                 }
                 robot.stepForward();
                 y = robot.getY();
                 System.out.println(" y = " + y);
             }
         }
     }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 *
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит:
 * вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 *
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 *
 * public class Robot {
 *
 *     public Direction getDirection() {
 *         // текущее направление взгляда
 *     }
 *
 *     public int getX() {
 *         // текущая координата X
 *     }
 *
 *     public int getY() {
 *         // текущая координата Y
 *     }
 *
 *     public void turnLeft() {
 *         // повернуться на 90 градусов против часовой стрелки
 *     }
 *
 *     public void turnRight() {
 *         // повернуться на 90 градусов по часовой стрелке
 *     }
 *
 *     public void stepForward() {
 *         // шаг в направлении взгляда
 *         // за один шаг робот изменяет одну свою координату на единицу
 *     }
 * }
 * Direction, направление взгляда робота,  — это перечисление:
 * public enum Direction {
 *     UP,
 *     DOWN,
 *     LEFT,
 *     RIGHT
 * }
 * Пример
 *
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
 * robot.getDirection() == Direction.UP
 *
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 *
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 *
 *
 * P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо
 * написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.
 */