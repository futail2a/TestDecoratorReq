package RTC;


/**
* RTC/TimedPointCovariance2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPointCovariance2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PointCovariance2D data = null;

  public TimedPointCovariance2D ()
  {
  } // ctor

  public TimedPointCovariance2D (RTC.Time _tm, RTC.PointCovariance2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPointCovariance2D
