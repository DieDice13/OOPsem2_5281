package Classes;

import Interfaces.iReturnOrder;

/**
 * Акционный клиент 
 */
public class PromotionalClient extends Actor implements iReturnOrder{
    
    private String nameProm; // Название акции
    private int idClient; // id клиента
    private static int numberOfParticipants; // Количество участников акции

    /**
     * Конструктор
     * @param name  Имя клиента
     * @param nameProm Название акции
     */
    public PromotionalClient(String name, String nameProm, int idClient) {
        super(name);
        this.nameProm = nameProm;
        this.idClient = numberOfParticipants + 1;
        numberOfParticipants++;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void returnOrder(Actor actor) {
        System.out.println("Возврат товара");
    }
}