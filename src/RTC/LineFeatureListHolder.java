package RTC;


/**
* RTC/LineFeatureListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef LineFeatureList
     */
public final class LineFeatureListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.LineFeature value[] = null;

  public LineFeatureListHolder ()
  {
  }

  public LineFeatureListHolder (RTC.LineFeature[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.LineFeatureListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.LineFeatureListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.LineFeatureListHelper.type ();
  }

}
