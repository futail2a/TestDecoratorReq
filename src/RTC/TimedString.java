package RTC;


/**
* RTC/TimedString.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedString implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data = null;

  public TimedString ()
  {
  } // ctor

  public TimedString (RTC.Time _tm, String _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedString
