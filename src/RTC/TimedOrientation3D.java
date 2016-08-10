package RTC;


/**
* RTC/TimedOrientation3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedOrientation3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Orientation3D data = null;

  public TimedOrientation3D ()
  {
  } // ctor

  public TimedOrientation3D (RTC.Time _tm, RTC.Orientation3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOrientation3D
