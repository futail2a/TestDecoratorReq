package RTC;

/**
* RTC/PanTiltAnglesHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PanTiltAnglesHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PanTiltAngles value = null;

  public PanTiltAnglesHolder ()
  {
  }

  public PanTiltAnglesHolder (RTC.PanTiltAngles initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PanTiltAnglesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PanTiltAnglesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PanTiltAnglesHelper.type ();
  }

}
