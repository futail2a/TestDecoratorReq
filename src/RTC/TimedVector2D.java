package RTC;


/**
* RTC/TimedVector2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedVector2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Vector2D data = null;

  public TimedVector2D ()
  {
  } // ctor

  public TimedVector2D (RTC.Time _tm, RTC.Vector2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVector2D
