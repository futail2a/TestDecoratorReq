package RTC;


/**
* RTC/RangeListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef RangeList
     */
public final class RangeListHolder implements org.omg.CORBA.portable.Streamable
{
  public double value[] = null;

  public RangeListHolder ()
  {
  }

  public RangeListHolder (double[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangeListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangeListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangeListHelper.type ();
  }

}
