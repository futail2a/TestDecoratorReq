package RTC;


/**
* RTC/Hypothesis2DListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef Hypothesis2DList
     */
public final class Hypothesis2DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Hypothesis2D value[] = null;

  public Hypothesis2DListHolder ()
  {
  }

  public Hypothesis2DListHolder (RTC.Hypothesis2D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Hypothesis2DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Hypothesis2DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Hypothesis2DListHelper.type ();
  }

}
