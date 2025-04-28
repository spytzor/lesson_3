#!/bin/bash

read -p "Enter an email address: " email

# Basic regex for validating email
regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$"

if [[ $email =~ $regex ]]; then
    echo "✅ Valid email address."
else
    echo "❌ Invalid email address."
fi

