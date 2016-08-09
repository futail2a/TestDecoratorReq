package RTC;


/**
* RTC/ActArrayActuatorPos.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class ActArrayActuatorPos implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Zero-based index of the actuator.
  public short index = (short)0;

  /// Position of the actuator in metres or radians.
  public double position = (double)0;

  public ActArrayActuatorPos ()
  {
  } // ctor

  public ActArrayActuatorPos (RTC.Time _tm, short _index, double _position)
  {
    tm = _tm;
    index = _index;
    position = _position;
  } // ctor

} // class ActArrayActuatorPos
