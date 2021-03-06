package designer.deployment;

public class GetIntegerInput extends GetDataInput {
    /**
     * 
     */
    private static final long serialVersionUID = 388945911126131246L;

    public GetIntegerInput() {
    }

    public Object getInput(String s, InputComponent object) throws InvalidDataException {
        Integer input;
        try {
            input = new Integer(s);
        } catch (Exception e) {
            String label = object.getText(InputComponent.LABEL);
            label = label.substring(0, label.lastIndexOf(":"));
            throw new InvalidDataException(label + " should be a integer number.");// Temp
                                                                                   // &
                                                                                   // test
        }
        return input;
    }
}
