package RTC;


/**
* RTC/TimedVector3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedVector3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Vector3D data = null;

  public TimedVector3D ()
  {
  } // ctor

  public TimedVector3D (RTC.Time _tm, RTC.Vector3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVector3D
