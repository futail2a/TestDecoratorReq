package RTC;


/**
* RTC/TimedOctet.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedOctet implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public byte data = (byte)0;

  public TimedOctet ()
  {
  } // ctor

  public TimedOctet (RTC.Time _tm, byte _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOctet
