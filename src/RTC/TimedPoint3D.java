package RTC;


/**
* RTC/TimedPoint3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPoint3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Point3D data = null;

  public TimedPoint3D ()
  {
  } // ctor

  public TimedPoint3D (RTC.Time _tm, RTC.Point3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoint3D
