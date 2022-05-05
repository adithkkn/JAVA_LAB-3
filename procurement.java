import java.io.*;
import java.time.LocaLDate;

class User
{
	int user_id,department_id;
    long int contact;
    String full_name, designation, user_name, password, user_category;
    void Add_User()
    {
    	// Adds user 
    }
    void delete_user(user_id)
    {
    	// deletes an existing user
    }
    void most_user_categories()
    {
    	//which categories has most users
    }
    void top_departments()
    {

    }
}


class Department
{
	int department_id;
	String department_name, encoded_by;
	LocaLDate Encoded_Date = new LocaLDate();
	void list_and_dep()
	{

	}
	void change_date()
	{

	}
	void top_departments()
	{

	}

}
class Item
{
	int item_id, unit_id, Category_id, price;
	String item_name,encoded_by;
	LocaLDate Encoded_Date = new LocaLDate();
	void drop_item()
	{

	}
	void items_price()
	{
		//list of all items and total price based on category
	}
	void update_units()
	{
		//change in stock units when purchased 
	}
	void generate_bill_display_category()
	{
		//genereate bills and display based on categories 
	}

}
class Item_Category
{
	int Category_id;
	String name;
	void Add_name()
	{
		// Adds Category name 
	}
	void Remove_name(name)
	{
		// removes name from category
	}
	void top_category()
	{
		//top categories
	}

}

class Unit
{
	int unit_id;
	String name, description;

	void top_units()
	{

	}
	void remove_items_with_less_unit()
	{
		//remove less demand items
	}

}

class Procurement_Plan
{
	int plan_id, item_id, unit_price,Total_Amount ,Department_id;
	long int Total_quantity;
	String requested_by,plan_status;
	void Change_Request_(Department_id)
	{
		// changes request
	}
	void top_plans()
	{

	}
	void change_in_plan()
	{
		//modify functionalities
	}
	void generate_plans()
	{
		//show all the plans
	}
	void most_request()
	{
		//show the most requested 
	}


}

class Purchase_Request
{
	int purchase_id, department_id;
	String requested_by,purpose,processed_by,status;
	LocaLDate Date_processed = new LocaLDate();	
	void pending_req()
	{

	}
	void department_req()
	{
		//tocheck which dep has most pending requests
	}
	void sort_by_date_pending()
	{
		//sort by date based on pending 
	}
	void change_purchase_req_status()
	{

	}
}

class Purchase_Request_Detail
{
	int request_id, item_id, purchase_id, estimated_amount, estimated_cost;
	long int Total_quantity;
	boolean request_status;
	String Quarter;
	boolean cancelled_accepted_pending_req(request_status)
	{
		//canceled accept pending request details
	}
	boolean toppurchases(purchase_id)
	{
		//top purchases
	}
	void itemsandquantity(item_id,Total_quantity)
	{

	}

}

class Purchase_Order
{
	int Purchase_Order_id;
	String Mode_of_payment,supplier,supplier_address;
	boolean Purchase_Order_status;
	LocaLDate Date_processed = new LocaLDate();	
	LocaLDate Date = new LocaLDate();
	boolean Check_Purchase_status(Purchase_Order_id)
	{
		// checks the purchase status
	}
	boolean cancelorder(Purchase_Order_status)
	{
//top cancel the order
	}
	void topsuppliers(supplier_address)
	{
		//top suppliers 
	}
	void topsalesdate(Date_processed)
	{
		//top sales based on date
	}

}

class Voucher
{
	int voucher_id;
	String processed_by, Purchase_Order;
	LocaLDate Date_processed = new LocaLDate();
	
	void top_vouchers()
	{
		//top vouchers 
	}
	void top_orders()
	{

	}

}
