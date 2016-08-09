package RTC;

/**
* RTC/RangeDataHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class RangeDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangeData value = null;

  public RangeDataHolder ()
  {
  }

  public RangeDataHolder (RTC.RangeData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangeDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangeDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangeDataHelper.type ();
  }

}
