package RTC;


/**
* RTC/TimedPoint2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPoint2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Point2D data = null;

  public TimedPoint2D ()
  {
  } // ctor

  public TimedPoint2D (RTC.Time _tm, RTC.Point2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoint2D
