package RTC;


/**
* RTC/ActArrayActuatorSpeed.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class ActArrayActuatorSpeed implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Zero-based index of the actuator.
  public short index = (short)0;

  /// Speed of the actuator in metres per second or radians per second.
  public double speed = (double)0;

  public ActArrayActuatorSpeed ()
  {
  } // ctor

  public ActArrayActuatorSpeed (RTC.Time _tm, short _index, double _speed)
  {
    tm = _tm;
    index = _index;
    speed = _speed;
  } // ctor

} // class ActArrayActuatorSpeed
