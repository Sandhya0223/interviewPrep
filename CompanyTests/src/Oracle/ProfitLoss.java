package Oracle;
/*
 * NetSuite Onsite Question;
 * sl - orderType - quantity - price
 *  1 - Purchase Order - 10 - 10
 *  2 - Purchase Order - 10 - 20
 *  3 - sale Order     - 15 - 30
 *  4 - Purchase Order - 10 - 15
 *  5 - Sale order     - 10 - 30
 *  
 *  For first three transactions
 *   15*30 - (10*10+5*20) = 450 -(100+100) = 250 profit
 *  For last two transactions
 *   10*30 - ( 5*20 + 5*15) = 300 -(100+75) = 125 profit
 *   
 *   Find the profit of the transactions 
 *   250+125 = 375$
 *   
 */  
public class ProfitLoss {

}
