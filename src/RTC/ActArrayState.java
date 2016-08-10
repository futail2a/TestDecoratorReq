package RTC;


/**
* RTC/ActArrayState.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class ActArrayState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Sequence of actuator states, one for each actuator.
  public RTC.Actuator actuators[] = null;

  public ActArrayState ()
  {
  } // ctor

  public ActArrayState (RTC.Time _tm, RTC.Actuator[] _actuators)
  {
    tm = _tm;
    actuators = _actuators;
  } // ctor

} // class ActArrayState
