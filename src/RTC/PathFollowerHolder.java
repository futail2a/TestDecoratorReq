package RTC;

/**
* RTC/PathFollowerHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��9�� 13��07��35�b JST
*/

public final class PathFollowerHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PathFollower value = null;

  public PathFollowerHolder ()
  {
  }

  public PathFollowerHolder (RTC.PathFollower initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PathFollowerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PathFollowerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PathFollowerHelper.type ();
  }

}
