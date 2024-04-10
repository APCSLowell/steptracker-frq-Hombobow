import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minS, daysA, allS, numD;
 public StepTracker(int a) {
  minS = a;
  daysA = 0;
  allS = 0;
  numD = 0;
 }
 public int activeDays() {
  return daysA;
 }
 public void addDailySteps(int steps) {
  numD++;
  allS += steps;
  if (steps > minS) {
   daysA++;
  }
 }
 public double averageSteps() {
  if (numD == 0) {
   return 0.0;
  }
  return (double) allS / numD;
 }
} 
