-- Insert default admin user (password: admin123)
INSERT INTO users (username, password, email, full_name, role)
VALUES ('admin', '$2a$10$rDkWMF.YBwAHF8.wQvQW.uRpkDUyZjOPm4BJ5xeJsn0tnqIAFz9Oi', 'admin@expensetracker.com', 'System Administrator', 'ADMIN');

-- Insert default categories
INSERT INTO categories (name, description, created_by)
VALUES 
('Food & Dining', 'Expenses related to food, restaurants, and groceries', 1),
('Transportation', 'Expenses for public transport, fuel, and vehicle maintenance', 1),
('Housing', 'Rent, utilities, and home maintenance expenses', 1),
('Entertainment', 'Movies, games, and other entertainment expenses', 1),
('Shopping', 'Clothing, electronics, and other retail purchases', 1),
('Healthcare', 'Medical expenses, medicines, and health insurance', 1),
('Education', 'Tuition fees, books, and educational materials', 1),
('Travel', 'Vacation expenses, hotels, and flights', 1),
('Bills & Utilities', 'Regular monthly bills and utility payments', 1),
('Others', 'Miscellaneous expenses', 1);
