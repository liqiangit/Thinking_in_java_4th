//: enumerated/EnumSets.java
// Operations on EnumSets
package com.liqiangit.Thinking_in_java_4th;
import static net.mindview.util.Print.print;

import java.util.EnumSet;

import enumerated.AlarmPoints;

public class EnumSets {
  public static void main(String[] args) {
    EnumSet<AlarmPoints> points =
      EnumSet.allOf(AlarmPoints.class); // Empty set
    print(points);
  }
} /* Output:
[BATHROOM]
[STAIR1, STAIR2, BATHROOM, KITCHEN]
[LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY]
[LOBBY, BATHROOM, UTILITY]
[STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
*///:~
