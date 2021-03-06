package solutions.questiona22c;

public class CycleDemo {

  public static void main(String[] args) {

    try {
      GroupEmailAddress multicoreProgrammingGroup = new GroupEmailAddress("multicore@doc.ic.ac.uk");
      GroupEmailAddress softwarePerformanceOptimizationGroup =
          new GroupEmailAddress("spo@doc.ic.ac.uk");

      softwarePerformanceOptimizationGroup.addEmailAddress(multicoreProgrammingGroup);
      multicoreProgrammingGroup.addEmailAddress(softwarePerformanceOptimizationGroup);

    } catch (DuplicateEmailAddressException e) {
      System.out.println("This block should not be reached.");
    } catch (CyclicEmailGroupException e) {
      System.out.println("Error: made a cyclic relationship between email groups!");
    }
  }
}
