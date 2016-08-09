package RTC;

/**
* RTC/OGMapServerHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��9�� 13��07��35�b JST
*/


/*!
   * @interface OGMapServer
   * @brief Occupancy Grid Map Service Interface
   */
public final class OGMapServerHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.OGMapServer value = null;

  public OGMapServerHolder ()
  {
  }

  public OGMapServerHolder (RTC.OGMapServer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.OGMapServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.OGMapServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.OGMapServerHelper.type ();
  }

}
