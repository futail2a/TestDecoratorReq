package RTC;


/**
* RTC/GripperState.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class GripperState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Status of the gripper.
  public RTC.GripperStatus status = null;

  public GripperState ()
  {
  } // ctor

  public GripperState (RTC.Time _tm, RTC.GripperStatus _status)
  {
    tm = _tm;
    status = _status;
  } // ctor

} // class GripperState
