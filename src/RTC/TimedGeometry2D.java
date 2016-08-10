package RTC;


/**
* RTC/TimedGeometry2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedGeometry2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Geometry2D data = null;

  public TimedGeometry2D ()
  {
  } // ctor

  public TimedGeometry2D (RTC.Time _tm, RTC.Geometry2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedGeometry2D
