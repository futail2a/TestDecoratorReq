package RTC;


/**
* RTC/TimedSize3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedSize3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Size3D data = null;

  public TimedSize3D ()
  {
  } // ctor

  public TimedSize3D (RTC.Time _tm, RTC.Size3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSize3D
