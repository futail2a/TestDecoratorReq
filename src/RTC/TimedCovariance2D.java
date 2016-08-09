package RTC;


/**
* RTC/TimedCovariance2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedCovariance2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Covariance2D data = null;

  public TimedCovariance2D ()
  {
  } // ctor

  public TimedCovariance2D (RTC.Time _tm, RTC.Covariance2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCovariance2D
