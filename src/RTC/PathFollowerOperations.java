package RTC;


/**
* RTC/PathFollowerOperations.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/MobileRobot.idlから
* 2016年8月10日 14時37分11秒 JST
*/

public interface PathFollowerOperations 
{
  RTC.RETURN_VALUE followPath (RTC.Path2D path);
  RTC.RETURN_VALUE getState (RTC.FOLLOWER_STATEHolder state);
  RTC.RETURN_VALUE followPathNonBlock (RTC.Path2D path);
} // interface PathFollowerOperations
