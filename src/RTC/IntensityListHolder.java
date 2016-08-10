package RTC;


/**
* RTC/IntensityListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef IntensityList
     */
public final class IntensityListHolder implements org.omg.CORBA.portable.Streamable
{
  public double value[] = null;

  public IntensityListHolder ()
  {
  }

  public IntensityListHolder (double[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.IntensityListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.IntensityListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.IntensityListHelper.type ();
  }

}
