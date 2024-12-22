async function getCustomers(url) {
    try {
        const response = await fetch(url);
        const body = await response.json();

        if (!response.ok) {
            throw new Error(body.message);
        }

        const table = document.getElementById("table");
        table.innerHTML = ""; // Clear table first

        body.forEach((customer) => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
                <td>${customer.phone}</td>
                <td><button onclick="deleteCustomer(${customer.id})">delete</button></td>
                <td><button onclick="updateCustomer(${customer.id})">edit</button></td>
            `;
            table.appendChild(row);
        });
    } catch (error) {
        console.error("Error fetching customers:", error);
    }
}


async function addCustomer() {
    const form = document.getElementById("form");

    const customer = {
        firstName: form.firstName.value,
        lastName: form.lastName.value,
        email: form.email.value,
        phone: form.phone.value,
    };

    try {
        const response = await fetch(url, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(customer),
        });

        if (!response.ok) {
            const errorBody = await response.json();
            throw new Error(errorBody.message || "Failed to add customer");
        }

        // Fetch the updated list after adding a customer
        await getCustomers(url);
    } catch (error) {
        console.error("Error adding customer", error);
    }
}

async function deleteCustomer(customerId){

    try {
        const response = await fetch(`${url}/${customerId}`, {
            method: "DELETE",
        });

        if (!response.ok) {
            const errorBody = await response.json();
            throw new Error(errorBody.message || "Failed to delete customer");
        }

        // Refresh the customer list after successful deletion
        await getCustomers(url);
    } catch (error) {
        console.log("Error deleting customer:", error);
    }

}

async function updateCustomer(customerId){

    const response = await fetch(url);
    const body = await response.json();

    let customer = null;
    body.forEach((customerEl) => {
        if(customerEl.id === customerId){
            customer = customerEl;
        }
    })

    const form = document.getElementById("form");

    form.firstName.value = customer.firstName || "";
    form.lastName.value = customer.lastName || "";
    form.email.value = customer.email || "";
    form.phone.value = customer.phone || "";

    customer = {
        firstName: form.firstName.value,
        lastName: form.lastName.value,
        email: form.email.value,
        phone: form.phone.value,
    }

    try {
        const response = await fetch(`${url}/${customerId}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(customer),
        });

        if (!response.ok) {
            const errorBody = await response.json();
            throw new Error(errorBody.message || "Failed to update customer");
        }

        await getCustomers(url);
    } catch (error) {
        console.log("Error updating customer", error);
    }

}

async function reset(){
    
    const form = document.getElementById("form");

    form.reset();

}

const url = "http://localhost:8080/javabank5/api/customer";

// Fetch the initial list of customers
getCustomers(url);

// Attach event listener
document.getElementById("add").addEventListener("click", addCustomer);
document.getElementById("reset").addEventListener("click", reset);