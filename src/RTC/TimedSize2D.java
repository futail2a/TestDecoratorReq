package RTC;


/**
* RTC/TimedSize2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedSize2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Size2D data = null;

  public TimedSize2D ()
  {
  } // ctor

  public TimedSize2D (RTC.Time _tm, RTC.Size2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSize2D
