package RTC;


/**
* RTC/TimedCovariance3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedCovariance3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Covariance3D data = null;

  public TimedCovariance3D ()
  {
  } // ctor

  public TimedCovariance3D (RTC.Time _tm, RTC.Covariance3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCovariance3D
