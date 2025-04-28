#!/bin/bash

# Function to validate email address
validate_email() {
    local email=$1
    # Regular expression to match a basic email format
    local regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"

    if [[ $email =~ $regex ]]; then
        echo "Valid email address: $email"
    else
        echo "Invalid email address: $email"
    fi
}

# Prompt user for email address
echo "Please enter your email address:"
read user_email

# Validate the email
validate_email "$user_email"
