package RTC;


/**
* RTC/PathFollowerOperations.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��9�� 13��07��35�b JST
*/

public interface PathFollowerOperations 
{
  RTC.RETURN_VALUE followPath (RTC.Path2D path);
  RTC.RETURN_VALUE getState (RTC.FOLLOWER_STATEHolder state);
  RTC.RETURN_VALUE followPathNonBlock (RTC.Path2D path);
} // interface PathFollowerOperations
