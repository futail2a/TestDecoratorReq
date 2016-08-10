package RTC;


/**
* RTC/PathPlannerOperations.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/MobileRobot.idlから
* 2016年8月10日 14時37分11秒 JST
*/

public interface PathPlannerOperations 
{

  /// Plan Path from PathPlanParater.
  RTC.RETURN_VALUE planPath (RTC.PathPlanParameter param, RTC.Path2DHolder outPath);
} // interface PathPlannerOperations
