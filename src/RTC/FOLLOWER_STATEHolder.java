package RTC;

/**
* RTC/FOLLOWER_STATEHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class FOLLOWER_STATEHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FOLLOWER_STATE value = null;

  public FOLLOWER_STATEHolder ()
  {
  }

  public FOLLOWER_STATEHolder (RTC.FOLLOWER_STATE initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FOLLOWER_STATEHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FOLLOWER_STATEHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FOLLOWER_STATEHelper.type ();
  }

}
