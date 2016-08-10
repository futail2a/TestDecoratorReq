package RTC;


/**
* RTC/PointFeatureListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @typedef PointFeatureList
     */
public final class PointFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointFeature value[] = null;

  public PointFeatureListHolder ()
  {
  }

  public PointFeatureListHolder (RTC.PointFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointFeatureListHelper.type ();
  }

}
