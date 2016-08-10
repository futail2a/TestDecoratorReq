package RTC;


/**
* RTC/TimedGeometry3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedGeometry3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Geometry3D data = null;

  public TimedGeometry3D ()
  {
  } // ctor

  public TimedGeometry3D (RTC.Time _tm, RTC.Geometry3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedGeometry3D
