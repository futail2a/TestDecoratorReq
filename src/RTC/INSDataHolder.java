package RTC;

/**
* RTC/INSDataHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class INSDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.INSData value = null;

  public INSDataHolder ()
  {
  }

  public INSDataHolder (RTC.INSData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.INSDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.INSDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.INSDataHelper.type ();
  }

}
