package RTC;


/**
* RTC/Actuator.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Actuator implements org.omg.CORBA.portable.IDLEntity
{

  /// rotary actuators).
  public double position = (double)0;

  /// Current speed of the actuator, in metres per second or radians per second.
  public double speed = (double)0;

  /// Current acceleration of the actuator, in metres per second or radians per second.
  public double accel = (double)0;

  /// Current draw of the actuator, in amps.
  public double current = (double)0;

  /// Status of the actuator.
  public RTC.ActArrayActuatorStatus status = null;

  public Actuator ()
  {
  } // ctor

  public Actuator (double _position, double _speed, double _accel, double _current, RTC.ActArrayActuatorStatus _status)
  {
    position = _position;
    speed = _speed;
    accel = _accel;
    current = _current;
    status = _status;
  } // ctor

} // class Actuator
