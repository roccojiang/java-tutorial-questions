package solutions.questionaa68;

import java.util.Objects;

public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public static Point origin() {
    return new Point(0, 0, 0);
  }

  public double distanceFrom(Point other) {
    double dx = x - other.x;
    double dy = y - other.y;
    double dz = z - other.z;

    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  public double magnitude() {
    return distanceFrom(origin());
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public boolean equals(Object other) {
    if (!canEqual(other)) {
      return false;
    }
    Point p = (Point) other;
    return p.canEqual(this) && x == p.x && y == p.y && z == p.z;
  }

  public boolean canEqual(Object other) {
    return other instanceof Point;
  }
}
