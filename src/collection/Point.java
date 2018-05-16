package collection;

import java.util.Objects;

/**
 * @author StevenBing
 * @version 1.0.0
 * @time Created in 2018/5/14 20:02
 */
public class Point implements Comparable<Point>{
    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point point) {
        if (this.getX().compareTo(point.getX()) == 0) {
            return this.getY().compareTo(point.getY());
        }
        return this.getX().compareTo(point.getX());
    }
}
