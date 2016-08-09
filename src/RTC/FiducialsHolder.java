package RTC;

/**
* RTC/FiducialsHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class FiducialsHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Fiducials value = null;

  public FiducialsHolder ()
  {
  }

  public FiducialsHolder (RTC.Fiducials initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialsHelper.type ();
  }

}
