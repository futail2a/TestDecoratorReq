package RTC;

/**
* RTC/RGBColourHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class RGBColourHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RGBColour value = null;

  public RGBColourHolder ()
  {
  }

  public RGBColourHolder (RTC.RGBColour initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RGBColourHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RGBColourHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RGBColourHelper.type ();
  }

}
