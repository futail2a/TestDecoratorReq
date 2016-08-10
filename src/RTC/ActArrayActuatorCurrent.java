package RTC;


/**
* RTC/ActArrayActuatorCurrent.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class ActArrayActuatorCurrent implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Zero-based index of the actuator.
  public short index = (short)0;

  /// Current of the actuator in amps.
  public double current = (double)0;

  public ActArrayActuatorCurrent ()
  {
  } // ctor

  public ActArrayActuatorCurrent (RTC.Time _tm, short _index, double _current)
  {
    tm = _tm;
    index = _index;
    current = _current;
  } // ctor

} // class ActArrayActuatorCurrent
