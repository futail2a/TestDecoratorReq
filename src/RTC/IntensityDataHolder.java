package RTC;

/**
* RTC/IntensityDataHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class IntensityDataHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.IntensityData value = null;

  public IntensityDataHolder ()
  {
  }

  public IntensityDataHolder (RTC.IntensityData initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.IntensityDataHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.IntensityDataHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.IntensityDataHelper.type ();
  }

}
